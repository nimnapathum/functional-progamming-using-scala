def outcome(ticket_price: Int):Double={
    (no_of_attendees(ticket_price)%120)*500 + 3*no_of_attendees(ticket_price)
}

def no_of_attendees(ticket_price: Int):Double={
    120 + (15-ticket_price)/5 *20
}

def income(ticket_price: Int): Double={
    no_of_attendees(ticket_price) * ticket_price
}

def profit(ticket_price: Int):Double={
    income(ticket_price) - outcome(ticket_price)
}