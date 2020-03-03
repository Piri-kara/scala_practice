object Sample29{
  def main(args: Array[String]){
    // サブクラスのインスタンスはスーパークラス型の変数で参照することが可能
    // サブクラスをスーパークラス型でグルーピングしている
    val dog:Animal=new Dog("ジョン", 5, false)
    val cat:Animal=new Cat("ミー", 3, true)

    dog.introduce()
    cat.introduce()
    dog.move()
    cat.move()
  }
}

class Animal(private val kind:String,
             private val name:String,
             private var age:Int,
             private val gender:Boolean){
               def introduce(){
                 println(kind+"の"+name+"は"+(if(gender)"メス"else"オス")+"で"+age+"歳です。")
               }
               def move(){
                 println(kind+"の"+name+"は移動しました。")
               }
             }
// class サブクラス extends スーパークラスでクラスの継承が可能。
// Animalクラスを継承したDogクラスとCatクラスを定義している
// 2つのクラスは基本コンストラクタとしてname, age, genderの3つのクラスパラメーターを定義している。
// Animalクラスから継承の際に必要な値を受け渡している
class Dog(name:String, age:Int, gender:Boolean)
      extends Animal("犬", name, age, gender)
class Cat(name:String, age:Int, gender:Boolean)
      extends Animal("猫", name, age, gender)