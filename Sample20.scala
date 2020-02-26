object Sample20{
  def main(args: Array[String]){
    // 基本コンストラクタ
    // インスタンス生成時に引数を記述すること
    // 引数をクラスパラメータと言う
    val p1=new Person("山田", 24)
    val p2=new Person("田中", 38)

    p1.introduce()
    p2.introduce()
    // 下記はコンパイルエラーになる
    // println("フィールドにアクセス："+p1.name)
    // クラスパラメーターのnameはインスタンスフィールドではない
  }
}

class Person(name:String, age:Int){
  println("インスタンス化 名前："+name+" 年齢："+age)
  def introduce(){
    println("私は"+name+"、年齢は"+age+"歳です")
  }
}