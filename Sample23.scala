object Sample23{
  def main(args: Array[String]){
    val p = new Person("山田", 24)
    p.introduce()
    // privateフィールドに指定されているので、クラス外からアクセスできない
    // p.age=300
    p.birthday()
    p.introduce()
  }
}

class Person(n:String, a:Int){
  val name=n
  // アクセス修飾子を付加
  // mainメソッドで記述している「p.age=300」はコンパイル不可
  private var age=a
  // 同じクラス内であればageフィールドにアクセス可能
  def birthday(){
    println(name+"さんが誕生日を迎えました")
    age+=1
  }
  def introduce(){
    println("私は"+name+"、年齢は"+age+"歳です")
  }
}