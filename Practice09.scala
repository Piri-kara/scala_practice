object Practice09{
  def main(args: Array[String]){
    val t1=new Talent("石原真希", 22)
    val t2=new Talent("本庄ゆきえ", "本田良子")
    val t3=new Talent("市川瑠璃子", "山田美紀", 24)

    t1.profile()
    t2.profile()
    t3.profile()
  }
}

class Talent(s:String, r:String, a:Int){
  private val stageName=s
  private val realName=r
  private val age=a

  def this(s:String, r:String){
    this(s, r, -1)
  }
  def this(s:String, a:Int){
    this(s, "非公開", a)
  }

  def profile(){
    println("芸名："+stageName+" 本名："+realName+" 年齢："+(if(a<0)"非公開"else(age+"歳")))
  }
}