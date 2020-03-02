object Sample25{
  def main(args: Array[String]){
    val p1=new Person("山田", 24, "東京", "公務員")
    val p2=new Person("田中", 38, "千葉")
    val p3=new Person("中西", 27)

    p1.introduce()
    p2.introduce()
    p3.introduce()
  }
}

// クラスパラメーターにインスタンスフィールドの定義を結合
// クラスパラメーターにvar or valを追加するだけ！
// インスタンスフィールドとメソッド(または補助コンストラクタ)の引数名は重複OK
class Person(val name:String, var age:Int, val graduate:String, var job:String){
  def this(name:String, age:Int, graduate:String){
    this(name, age, graduate, "無職")
  }
  def this(name:String, age:Int){
    this(name, age, "不明")
  }

  def introduce(){
    println("名前："+name+" 年齢："+age+"歳"+" 出身："+graduate+" 職業："+job)
  }
}