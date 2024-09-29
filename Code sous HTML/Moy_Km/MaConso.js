let boutton=document.getElementById("boutton")
let date=document.getElementById("date")
let km=document.getElementById("km")
let litre=document.getElementById("litre")
let tableValue=document.getElementById("tableValue")
let tabConso=[]
let result=document.getElementById("result")

boutton.addEventListener("click",function(){
    console.log(date.value)
    console.log(km.value)
    console.log(litre.value)
    tabConso.push(litre.value)
    tableValue.innerHTML+="<tr> <td>"+date.value+" </td> <td>"+km.value+" </td> <td>"+litre.value+" </td> </tr>"
    console.log(moyenne(tabConso))
    result.textContent="La moyenne est de : "+moyenne(tabConso)+"L"
})

function moyenne(tabConso){
    let total=0
    for(let i=0; i<=tabConso.length-1; i++){
        total+=parseInt(tabConso[i])
    }
    console.log(total)
    return total/tabConso.length
}