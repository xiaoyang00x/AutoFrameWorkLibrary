yaml文件书写格式:
简单属性名1: 值(例如  age: 1)
简单属性名2: 值(例如  name: daisy)
引用对象属性名: !完整类名(例如  studentBean: !org.DataProvider.testdata.human.StudentBean)
  引用对象的简单属性名1: 值 (例如  studentName: Nina)
  引用对象的简单属性名2: 值 (例如  gender: female)