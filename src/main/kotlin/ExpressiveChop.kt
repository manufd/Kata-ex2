object ExpressiveChop: BinaryChop {
    override fun chop(valueToFind: Int, inputs: Array<Int>): Int = expressiveChop(valueToFind, inputs)


    private fun expressiveChop(valueToFind: Int, inputs: Array<Int>, startIndex: Int = -1, endIndex: Int = inputs.size) : Int =
            when{
                inputs.isEmpty() || endIndex - startIndex < 2           ->      -1
                inputs[middle(startIndex, endIndex)] == valueToFind     ->      middle(startIndex, endIndex)
                inputs[middle(startIndex, endIndex)] >  valueToFind     ->      expressiveChop(valueToFind, inputs, startIndex, middle(startIndex, endIndex))
                inputs[middle(startIndex, endIndex)] < valueToFind      ->      expressiveChop(valueToFind, inputs, middle(startIndex, endIndex), endIndex)
                else -> -1
            }

    private fun middle(startIndex: Int, endIndex: Int) : Int = (startIndex + endIndex) / 2
}