object Sample21{
  def main(args: Array[String]){
    // 基本コンストラクタとは、インスタンス化の際に呼び出されるメソッド
    // 下記変数を定義した時点で、personクラスの中にある処理が実行される
    val p1=new Person("山田", 24)
    val p2=new Person("田中", 38)

    p1.introduce()
    p2.introduce()
    println("フィールドにアクセス："+p1.name)
  }
}

class Person(n:String, a:Int){
  // クラスパラメータの値をインスタンスフィールドに渡している。
  // クラスパラメータとインスタンスフィールドの名前は重複してはいけない
  // 人の名前が変わらないことを前提に、名前は不変、年齢は可変変数で定義している
  val name=n
  var age=a
  // 基本コンストラクタの中身になる。インスタンス化される度に実行される処理。
  println("インスタンス化 名前："+name+" 年齢："+age)
  def introduce(){
    println("私は"+name+"、年齢は"+age+"歳です")
  }
}