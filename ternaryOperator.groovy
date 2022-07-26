def number = 50

//this is ternary operator
def result = (number>=50) ? 'something': 'something1' // condition? do something: do somthing else

println(result)

//this is the same as code above
if(number>=50){
    println("something")
    }else{
        println("something1")
}


def result1 = (number === 0) ? 'you have nothing' : (result1 = (number<10) ? 'you have somthing' : 'you have a lot') //not recomender, but works
println(result1)

if(number===0){
    println("you have nothing")
    }else if(number<10){
        println("you have somthing")
    }else{
        println("you have a lot")
}




