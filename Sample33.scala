object Sample33{
  def main(args: Array[String]){
    val h=new Human("山本", 26, true)
    h.speak()
    h.birthday()
    h.speak()
    // private修飾子が付いていないため、mainメソッドから値を変更できてしまう
    // しかし、Animalクラスのvarフィールドにprivateをつけると、Humanクラスで参照できなくなってしまう
    // privateではなく、protectedであれば、サブクラスに引き継ぐことができる
    h.age = 300
    h.speak()
  }
}

// 動物を表現するAnimalクラス
// 年齢と性別を持っている
// 誕生日が来れば1歳年をとるbirthdayメソッドを定義
class Animal(var age:Int, val gender:Boolean){
  def birthday(){
    println("１歳年をとりました。")
    age += 1
  }
}

// Animalクラスを継承するHumanクラス
// 動物に加えて名前をもつ
// 自己紹介のspeakメソッドを定義
class Human(val name:String, a:Int, g: Boolean) extends Animal(a,g){
  def speak(){
    println("私の名前は"+name+"、性別は"+(if(gender)"女性"else"男性")+"で年齢は"+age+"歳です。")
  }
}