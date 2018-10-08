object RecursiveBinaryChop : BinaryChop {
    override fun chop(valueToFind: Int, inputs: Array<Int>): Int {
        val startIndex = -1
        val endIndex = inputs.size

        return recursiveChop(valueToFind, inputs, startIndex, endIndex)
    }

    private fun recursiveChop(valueToFind: Int, inputs: Array<Int>, startIndex: Int, endIndex: Int) : Int{
        if(inputs == null || inputs.isEmpty()){
            return -1
        }
        if(valueToFind == inputs[middle(startIndex, endIndex)] ){
                    return middle(startIndex, endIndex)
        }
        if(endIndex - startIndex < 2){
            return -1
        }
        else if(valueToFind < inputs[middle(startIndex, endIndex)]){
            return recursiveChop(valueToFind, inputs, startIndex, middle(startIndex, endIndex))
        }
        else if(valueToFind > inputs[middle(startIndex, endIndex)]){
            return recursiveChop(valueToFind, inputs, middle(startIndex, endIndex), endIndex)
        }
        return 1000
    }

    fun middle(startIndex: Int, endIndex: Int) = (startIndex + endIndex) / 2

}