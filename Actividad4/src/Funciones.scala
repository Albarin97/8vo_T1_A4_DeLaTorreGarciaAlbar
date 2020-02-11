import scala.io.StdIn._
import scala.math._
import sun.security.util.Length

object Funciones {
  
  def leer() : Array[Double] = {
    println("Cuantos valores vas a ingresar?")
    var num = readInt()
    var valores = new Array[Double](num)
    var cont = 0;
    for(elemento <- valores){
      print("Introdusca el valor "+(cont+1)+": ")
      valores(cont)=readDouble()
      cont+=1
    }
    valores
  }
  
  def obtenerMedia(v:Array[Double]) : Double = {
      var media = 0.0;
      for(e <- v){
        media+=e
      }
      media=media/v.length
      media
  }
  
  def desviacionEstandar(v:Array[Double], media:Double) : Double = {
    var temp = new Array[Double](v.length)
    var cont = 0
    var sum = 0.0
    
    for(e <- v){
      temp(cont)=(e-media)*(e-media)
      cont+=1
    }
    for(e <- temp){
      sum+=e
    }
    var div = sum/v.length
    var DE = sqrt(div);
    DE
  }
  
  def main(args: Array[String]): Unit = {
    var valores = leer()
    var media = obtenerMedia(valores);
    var DE = desviacionEstandar(valores, media)
    
    println("La media es de: "+media)
    println("La Desviacion Estandar es de: "+DE)
    
    
  }
}