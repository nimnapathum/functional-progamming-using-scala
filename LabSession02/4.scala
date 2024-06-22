object question04{
    def main(args: Array[String]): Unit={
        println(s"Ticket Price     Profit")
        println(s"5                ${profit(5)}")
        println(s"10               ${profit(10)}")
        println(s"15               ${profit(15)}")
        println(s"20               ${profit(20)}")
        println(s"25               ${profit(25)}")

    }

    def noOfAttendees(ticket_price: Double): Double={
        120 + (15 - ticket_price) * 4 // /5 *20
    }

    def cost(ticket_price: Double): Double={
        var noOfiter = (noOfAttendees(ticket_price) / 120).toInt 
        if(noOfiter == 0){
            noOfiter = 1
        }
        return noOfiter * 500 + noOfAttendees(ticket_price) * 3
    }

    def income(ticket_price: Double): Double={
        ticket_price * noOfAttendees(ticket_price)
    }

    def profit(ticket_price: Double): Double={
        income(ticket_price) - cost(ticket_price)
    }
}