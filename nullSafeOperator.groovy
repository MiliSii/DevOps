//null-safe operator ( ?. )
//null safe navigation operator

def list1 = ['first', 'secund']

//list_value searches for list elements starting with the letter f
def list_value= list1.find { it.startsWith('f') } 

//prints the length of the element
println(list_value?.length())

//works also in this case
println(list_value.length())


def list_value1= list1.find { it.startsWith('m') } 
//if element doen't exist = null
println(list_value1?.length())


//prints the element from position 1
println(list1?.getAt(1))


Map nullMap = null
String key = 'name'

assert nullMap?.name == null// key literal
assert nullMap?."$key" == null // when value of variable is the key

