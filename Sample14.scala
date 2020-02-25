object Sample14{
  def main(args: Array[String]){
    val age=18

    /* if(条件式1){
      条件式1がtrueの際に実行 if式は終了
    }
    else if(条件式2){
      条件式1がfalseで条件式2がtrueの際に実行 if式は終了
    }
    else{
      条件式1,2が共にfalseの際に実行
    }
    */
    print(age+"歳は")
    if(age>=20){
      println("成人です")
    }
    else  if(age<20&&age>=0){
      println("未成年です")
    }
    else{
      println("不明です")
    }
  }
}