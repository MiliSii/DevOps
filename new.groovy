def list1 = ["first", "secund"]

println(list1[1]) 
println(list1.get(1))   //printuje element po ideksu

//Groovy passes an implicit parameter it which corresponds to the current element in each iteration
list1.each{println it * 2}  

//provides the current index value in addition to the current element:
list1.eachWithIndex{ it, i -> println "$i : $it" }


def myList = [1, 2, 3, ['a', 'b', "Groovy"], 4]
println(myList[3])


def map = [
    'FF0000' : 'Red',
    '00FF00' : 'Lime',
    '0000FF' : 'Blue',
    'FFFF00' : 'Yellow'
]

// iterate over the map by providing the each method 
map.each { println "Hex Code: $it.key = Color Name: $it.value" }
// improve the readability a bit by giving a name to the entry variable
map.each { entry -> println "Hex Code: $entry.key = Color Name: $entry.value" }
//address the key and value separately, we can list them separately 
map.each { key, val ->
    println "Hex Code: $key = Color Name $val"
}

def list2 = [2,1,3,4,5,6,78]
//To find the first object that matches a condition
assertTrue(list2.find {it > 3} == 4)
//To find all objects that match a condition
assertTrue(list2.findAll {it > 3} == [4,5,6])

