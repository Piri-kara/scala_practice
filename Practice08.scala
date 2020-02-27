object Practice08{
  def main(args: Array[String]){
    val jp = new Japanese("山田一郎", "2001-04-01", false, 123456789012L)

    // 外部からはアクセスできない
    // println(jp.mynumber)
    jp.showPrivateData()
  }
}

class Japanese(n:String, d:String, g:Boolean, num:Long){
  private val name = n
  private val birthday = d
  private val gender = g
  private val mynumber = num

  def showPrivateData(){
    println("-- "+name+"の個人情報 --")
    println("生年月日："+"birthday")
    println("性別："+(if(gender)"女性"else"男性"))
    println("マイナンバー："+mynumber)
  }

}