object FunctionalChop : BinaryChop{

    override fun chop(valueToFind: Int, inputs: Array<Int>): Int {

        var startIndex = -1
        var endIndex = inputs.size

        var middle: Int
        if (inputs != null && !inputs.isEmpty())
        while(endIndex - startIndex > 1 ){

            middle = middle(startIndex, endIndex)

            when{
                inputs[middle] == valueToFind -> return middle
                inputs[middle] >  valueToFind -> endIndex = middle
                inputs[middle] < valueToFind -> startIndex = middle
                else -> -1
            }
        }
        return -1
    }

    private fun middle(startIndex: Int, endIndex: Int): Int =
            (startIndex + endIndex) /2

}