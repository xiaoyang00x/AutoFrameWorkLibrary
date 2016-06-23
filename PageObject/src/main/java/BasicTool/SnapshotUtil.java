package BasicTool;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.ITestResult;

public class SnapshotUtil {

    public void createScreenshot(final ITestResult result, final WebDriver driver) {
        final DateFormat timeFormat = new SimpleDateFormat("MM.dd.yyyy HH-mm-ss");
        final String fileName = result.getMethod().getMethodName() + "_" + timeFormat.format(new Date());
        try {
            File scrFile;

            if (driver.getClass().equals(RemoteWebDriver.class)) {
                scrFile = ((TakesScreenshot) new Augmenter().augment(driver)).getScreenshotAs(OutputType.FILE);
            } else {
                scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            }

            String outputDir = result.getTestContext().getOutputDirectory();
            outputDir = outputDir.substring(0, outputDir.lastIndexOf('\\')) + "\\html";

            final File saved = new File(outputDir, fileName + ".png");
            FileUtils.copyFile(scrFile, saved);

            result.setAttribute("screenshot", saved.getName());
        } catch (IOException e) {
            result.setAttribute("reportGeneratingException", e);
        }

        result.setAttribute("screenshotURL", driver.getCurrentUrl());
    }

    private static List<String> list = new ArrayList<String>();

    public static void createScreenshots(final WebDriver driver) {
        final String fileName = String.valueOf(System.currentTimeMillis()) + getRandomString(9);
        try {
            File scrFile;

            if (driver.getClass().equals(RemoteWebDriver.class)) {
                scrFile = ((TakesScreenshot) new Augmenter().augment(driver)).getScreenshotAs(OutputType.FILE);
            } else {
                scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
            }

            final File saved = new File("resources/", fileName + ".png");
            FileUtils.copyFile(scrFile, saved);
            // Thumbnails.of("resources/" + fileName + ".png").size(2000, 1000).toFile("resources/" + fileName +
            // ".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
        list.add("resources/" + fileName + ".png");

    }

    public static void takeScreenshots(final ITestResult result) {
        List<String> list1 = new ArrayList<String>();
        list1.addAll(list);
        result.setAttribute("screenshots", list1);
        list.clear();

    }

    public static String getRandomString(int length) { // length琛ㄧず鐢燂拷?瀛楃涓茬殑闀垮害
        String base = "abcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(base.length());
            sb.append(base.charAt(number));
        }
        return sb.toString();
    }
}
