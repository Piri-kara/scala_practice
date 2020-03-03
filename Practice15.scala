object Practice15{
  def main(args: Array[String]){
    val c1=new Clock(10, 15, 30)
    c1.showData()
    println()
    val c2=new AlarmClock(15, 45, 20, 6, 30)
    c2.showData()
  }
}
// 時刻を表現するClockクラス
class Clock(private var hour:Int,
            private var minute:Int, 
            private var second:Int){
              def showData(){
                println("ただいまの時刻："+hour+"時"+minute+"分"+second+"秒")
              }
            }

// Clockクラスを継承するAleamClockクラス
// 差分コーディングとして、アラームの鳴る時間と分を表現するフィールドを追加定義（practice13を参照）
// サブクラスのクラスパラメーターに差分を含める
class AlarmClock(h:Int, m:Int, s:Int, 
                 private var ah:Int, 
                 private var am:Int)
                 extends Clock(h, m, s){
                   override def showData(){
                     super.showData()
                     println("アラーム設定時刻："+ah+"時"+am+"分")
                   }
                 }