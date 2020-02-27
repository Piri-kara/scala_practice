object Sample22{
  def main(args: Array[String]){
    val p = new Person("山田", 24)
    p.introduce()
    //年齢を強引に変更
    // 300歳はありえないやろ......
    p.age = 300
    p.introduce()

  }
}

class Person(n: String, a:Int){
  // valで定義しているため、外部から値を変更することはできない
  val name=n

  // vareで定義しているため、外部から値を簡単に変更できてしまう
  var age=a

  def introduce(){
    println("私は"+name+"、年齢は"+age+"歳です")
  }
}

// 外部から簡単に値を変更されてしまうことを防ぐため、
// クラスのメンバであるフィールドやメソッドは外部からアクセスできないよう設定することができる