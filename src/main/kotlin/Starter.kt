     fun main(args: Array<String>) {

         val chop = IterativeBinaryChop.chop(11, arrayOf(1,3,5,10,12))
         val chop2 = RecursiveBinaryChop.chop(11, arrayOf(1,3,5,10,12))
         val chop3 = FunctionalChop.chop(11, arrayOf(1,3,5,10,12))
         val chop4 = ExpressiveChop.chop(11, arrayOf(1,3,5,10,12))
         println(chop)
         println(chop2)
         println(chop3)
         println(chop4)

     }