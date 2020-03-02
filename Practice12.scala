object Practice12{
  def main(args: Array[String]){
    println("ロボット総生産数："+Robot.getTotal)

    val r1=new Robot("RX")
    val r2=new Robot("SS")
    val r3=new Robot("ZK")
    println("ロボット総生産数："+Robot.getTotal)
    r1.introduce()
    r2.introduce()
    r3.introduce()
  }
}

object Robot{
  // totalの初期値を定義
  private var total:Int=0
  // totalの値を取得
  // totalはインスタンスが作成される度に1ずつ更新される
  def getTotal=total
}

class Robot(private val name:String){
  // オブジェクト名を使ってアクセスする
  // Robotオブジェクトのtotalを更新
  Robot.total += 1
  private val id=Robot.total
  // introduceメソッドの返り値はインスタンス毎に変わるため、コンパニオンクラスに記述
  def introduce(){
    println("ID："+id+"NAME："+name)
  }
}