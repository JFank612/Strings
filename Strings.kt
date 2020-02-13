fun main(){
    val answer1 = "A"
    val answer2 = "B"
    val answer3 = "C"
    val answer4 = "D"
    var score = 0

    println("What State shares a border with Illinois?")
    println("A. Florida")
    println("B. Nebraska")
    println("C. Wisconsin")
    println("D. All of the above")
    print("Your answer:")
    val question1 = readLine()!!.toUpperCase()

    if(question1 == answer3) {
        println("That is correct.")
        score++

    } else {
        println("That is incorrect.")
    }
    println("$score out of 1 \n")

    println("Who was our first President?")
    println("A. Abraham Lincoln")
    println("B. William Taft")
    println("C. Jimmy Cater")
    println("D. George Washington")
    print("Your answer:")
    val question2 = readLine()!!.toUpperCase()

    if(question2 == answer4) {
        println("That is correct.")
        score++

    } else {
        println("That is incorrect.")
    }
    println("$score out of 2 \n")

    println("What is the most popular sport in the World?")
    println("A. Soccer")
    println("B. Golf")
    println("C. Rugby")
    println("D. Basketball")
    print("Your answer:")
    val question3 = readLine()!!.toUpperCase()

    if(question3 == answer1) {
        println("That is correct.")
        score++

    } else {
        println("That is incorrect.")
    }
    println("$score out of 3 \n")

    println("Who sings the song'Free Bird'?")
    println("A. Boston")
    println("B. Lynyrd Skynyrd")
    println("C. AC/DC")
    println("D. Bruce Springsteen")
    print("Your answer:")
    val question4 = readLine()!!.toUpperCase()

    if(question4 == answer2) {
        println("That is correct.")
        score++

    } else {
        println("That is incorrect.")
    }
    println("$score out of 4 \n")

    println("What was the answer to the first question?")
    println("A. D")
    println("B. A")
    println("C. B")
    println("D. C")
    print("Your answer:")
    val question5 = readLine()!!.toUpperCase()

    if(question5 == answer4) {
        println("That is correct.")
        score++

    } else {
        println("That is incorrect.")
    }
    println("$score out of 5 \n")

    if(score == 5){
        println("You got them all right. Good Job!")
    }else {
        println("you got $score out of 5 correct.")
    }


}