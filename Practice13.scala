object Practice13{
  def main(args: Array[String]){
    val p=new Pitcher("山田", 99, 0.09, 2.13)
    p.changeBattingAverage(0.02)
    p.introduce()
  }
}


// 全ての野球選手には選手名、背番号、打率がある
// ピッチャーはそれらに加えて防御率を持っている
class BaseballPlayer(val name:String,
                     val uniformNumber:Int,
                     var battingAverage:Double){
                       def changeBattingAverage(change:Double){
                         battingAverage+=change
                       }
                     }
// サブクラスのPitcherで差分（防御率era）を補う=>差分コーディング
// PitcherクラスとBaseballPlayerのパラメーターが同じ名前だとエラーになってしまう
class Pitcher(n:String, 
              un:Int,
              ba:Double,
              era:Double)
              extends BaseballPlayer(n, un, ba){
                def introduce(){
                  println("選手名："+name)
                  println("背番号："+uniformNumber)
                  println("打率："+battingAverage)
                  println("防御率："+era)
                }
              }