object Sample04{
  def main(args: Array[String]){
    //浮動小数点型
    //Float型(4バイト)とDouble型(8バイト)
    //Eを用いて指数部を表現することができる
    //「1.2E」は「1.2×10の2乗」、[1.2E-2]は「1.2×10の-2乗」
    //デフォルトはDouble型
    //末尾にFがある場合はFloat型として扱われる
    //末尾にDでDouble型を明示できる
    println(3.14)
    println(1.2E2)
    println(1.2E-2)
    println(4.5F)
    println(5.6D)
    println(7.8E3F)
    println(8.9E-3D)
  }
}