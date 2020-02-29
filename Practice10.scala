object Practice10{
  def main(args: Array[String]){
    val car1=new Car("ファット", 1234, 10.0)
    val car2=new Car("トント", 6789)

    car1.run(7.0)
    car2.run(7.0)
    car1.showInfo()
    car2.showInfo()
  }
}

class Car(private val model:String, private val number:Int, private var gasoline:Double){
  def this(model: String, number:Int){
    this(model, number, 5.0)
  }
  def run(need:Double){
    if(gasoline>=need){
      println("ナンバー"+number+"の"+model+"はガソリン"+need+"リットル分走行しました")
      gasoline -= need
    }
    else{
      println("ナンバー"+number+"の"+model+"はガソリン不足のため走行できません")
    }
  }
  def showInfo(){
    println("車種："+model+" ナンバー："+number+" ガソリン："+gasoline+"リットル")
  }
}