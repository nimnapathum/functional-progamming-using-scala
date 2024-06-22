object question03{
    def main(args: Array[String]): Unit={
        var typical_normal_WH = 40
        var typical_OT_WH = 30
        println("Take home salary--------------------")
        println(s"Normal working hours : $typical_normal_WH")
        println(s"OT working hours     : $typical_OT_WH")
        println(s"                     : ${find_salary(typical_normal_WH , typical_OT_WH)}")
    }

    def normal_WH(hours: Int): Double={
        hours * 250
    }

    def OT_WH(hours: Int): Double={
        hours * 85
    }

    def tax(basic_salary: Double): Double={
        basic_salary * 0.12
    }

    def basic_salary(normal_hours: Int , OT_hours: Int): Double={
        normal_WH(normal_hours) + OT_WH(OT_hours)
    }

    def find_salary(normal_hours: Int , OT_hours: Int): Double={
        basic_salary(normal_hours , OT_hours) - tax(basic_salary(normal_hours , OT_hours))
    }
}