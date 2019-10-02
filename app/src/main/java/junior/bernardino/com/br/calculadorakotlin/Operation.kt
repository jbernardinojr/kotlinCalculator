package junior.bernardino.com.br.calculadorakotlin

class Operation {

    var operator1 : Double = 0.0
    var operator2 : Double = 0.0
    var operation : String = ""

    constructor(operator1: Double, operator2: Double, operation: String) {
        this.operator1 = operator1
        this.operator2 = operator2
        this.operation = operation
    }

    fun operationCalc () : Double {

        var resp = 0.0
        when (operation) {
            var a
            var b
            "/"->{
                resp = operator1.div(operator2)
                return a/b
            }
            
            "x"-> {
                resp = operator1.div(operator2)
                return a*b
            }
            "-"-> {
                resp = operator1.div(operator2)
                return a-b
            }
            "+"-> {
                resp = operator1.div(operator2)
                return a+b
            }
        }
   
    }
}
