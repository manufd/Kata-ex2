object IterativeBinaryChop : BinaryChop {
    override fun chop(valueToFind: Int, inputs: Array<Int>): Int {

        var startIndex = -1
        var endIndex = inputs.size
        var currentIndex: Int = calculateCurrentIndex(startIndex, endIndex)

        while(currentIndex in 0..inputs.size && endIndex - startIndex > 1 ){
            if(inputs[currentIndex] == valueToFind){
                return currentIndex
            }
            else{
                if(valueToFind < inputs[currentIndex]){
                    endIndex = currentIndex
                }
                else if(valueToFind > inputs[currentIndex] ) {
                    startIndex = currentIndex
                }
                currentIndex = calculateCurrentIndex(startIndex, endIndex)
            }
        }

        return -1
    }

    private fun calculateCurrentIndex(startIndex: Int, endIndex: Int): Int =
         (startIndex + endIndex) /2
}