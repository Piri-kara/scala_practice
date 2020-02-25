object Practice05{
  def main(args: Array[String]){
    // 円の半径の宣言
    val r=5.0
    // 円の面積を出力
    println("半径"+r+"の円の面積は"+getArea(r))
    // 底辺と高さ変数を宣言
    val base=9.0
    val height=5.0
    // 三角形の面積を出力
    println("底辺"+base+"、高さ"+height+"の三角形の面積は"+getArea(base,height))
    // 上底と下底の変数を宣言
    val upperBase=8.0
    val lowerBase=10.0
    // 台形の面積を出力
    println("上底"+upperBase+"、下底"+lowerBase+"、高さ"+height+"の台形の面積は"+getArea(upperBase, lowerBase, height))
  }
  def getArea(a:Double):Double = {
    return (a*a)*3.14
  }
  def getArea(a:Double, b:Double):Double = {
    return (a*b)/2
  }
  def getArea(a:Double, b:Double, c:Double):Double = {
    return (a+b)*c/2
  }
}