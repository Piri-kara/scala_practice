object Sample28{
  def main(args: Array[String]){
    val dog=new Dog("ジョン", 5, false)
    val cat=new Cat("ミー", 3, true)

    dog.introduce()
    cat.introduce()
    dog.move()
    cat.move()
  }
}

class Dog(private val name:String,
          private var age:Int,
          private val gender:Boolean){
            def introduce(){
              println("犬の"+name+"は"+(if(gender)"メス"else"オス")+"で"+age+"歳です")
            }
            def move(){
              println("犬の"+name+"は移動しました。")
            }
          }
class Cat(private val name:String,
          private var age:Int,
          private val gender:Boolean){
            def introduce(){
              println("猫の"+name+"は"+(if(gender)"メス"else"オス")+"で"+age+"歳です")
            }
            def move(){
              println("猫の"+name+"は移動しました。")
            }
          }