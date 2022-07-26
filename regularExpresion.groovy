//regex - patterns used to find substrings in a text(or a String) 
//~"expression"


def match = "Groovy" =~ "Groovy"

println match //java.util.regex.Matcher[pattern=Groovy region=0,6 lastmatch=]
println "Groovy" =~ "Groovy"  //java.util.regex.Matcher[pattern=Groovy region=0,6 lastmatch=]
println match[0] //it will print Groovy, match possition 0, without possition it can not be printed


if(match){
   println match[0]
}else{
   println "no match found"
}

def match1 = "Groovy" =~ "o" //through if it will return o, because possition is math1[0] - without while(like in if above)

if(match1){   
    def i=0
    while(match1){  
        println match1[i]
        i++
        }
}else{
   println "no match found"
}