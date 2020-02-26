object Sample19{
  def main(args: Array[String]){
    // インスタンスを作成
    val p1 = new Person
    val p2 = new Person
    
    // 各インスタンスの属性を更新 
    p1.name = "山田"
    p1.age = 24

    p2.name = "田中"
    p2.age = 38

    // メソッドを呼び出す
    p1.introduce()
    p2.introduce()
  }
}

// Personクラスを定義
// Personクラスは名前・年齢という属性を持ち、これを用いて自己紹介をする
class Person{
  var name=""
  var age=0

  def introduce(){
    println("私は"+name+"、年齢は"+age+"歳です")
  }
}