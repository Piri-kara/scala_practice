object Practice02{
  def main(args: Array[String]){
    println("身長(cm)を入力してください")
    val height=scala.io.StdIn.readDouble
    println("体重(kg)を入力してください")
    val weight=scala.io.StdIn.readDouble

    var bmi=weight/((height/100)*(height/100))
    println("あなたのBMI値は"+bmi+"です")
    val result=
    if(bmi>=26.5){
      "肥満"
    }
    else if(bmi < 26.5 && bmi >= 24){
      "太り気味"
    }
    else if(bmi < 24 && bmi >= 20){
      "普通"
    }
    else{
      "スリム"
    }
    println("あなたは"+result+"です")
  }
}