object Sample11{
  def main(arg: Array[String]){
    val x=7
    val y=3
    //関係演算子
    //2つのデータの大小関係などを調査し、結果をBoolean型で返す
    //演算子には優先順位があり、「+」と「==」では「+」の優先順位が高い
    //関係演算の優先順位を調整するため（）で囲む
    //()で囲まれた演算はどの演算よりも優先される
    println(x+"=="+y+":"+(x==y))
    println(x+"!="+y+":"+(x!=y))
    println(x+">"+y+":"+(x>y))
    println(x+"<"+y+":"+(x<y))
  }
}