const eleitores = [ {name:'Bob' , age: 30, voted: true}, 
{name:'Jake' , age: 32, voted: true}, 
{name:'Kate' , age: 25, voted: false}, 
{name:'Sam' , age: 20, voted: false}, 
{name:'Phil' , age: 21, voted: true}, 
{name:'Ed' , age:55, voted:true}, 
{name:'Tami' , age: 54, voted:true}, 
{name: 'Mary', age: 31, voted: false}, 
{name: 'Becky', age: 43, voted: false}, 
{name: 'Joey', age: 41, voted: true}, 
{name: 'Jeff', age: 30, voted: true}, 
{name: 'Zack', age: 19, voted: false} ]

// Primeira resolução

const votes = eleitores.reduce((acc,current)=> {
    if(current.age<=25){
         acc.numYoungPeople ++
         current.voted == true ? acc.numYoungVotes ++ : acc.numYoungVotes
    } else if(current.age>35){
         acc.numOldPeople ++
         current.voted == true ? acc.numOldVotes ++ : acc.numOldVotes
    } else{
         acc.numMidPeople ++
         current.voted == true ? acc.numMidVotes ++ : acc.numMidVotes
    }

    return acc
},
{numYoungVotes: 0, numYoungPeople: 0, numMidVotes: 0, numMidPeople: 0, numOldVotes: 0, numOldPeople: 0})

console.log(votes)

// Refatorado

const determinarFaixaDeIdade = (age) => {
     if(18<= age && age<=25){
         return "Young"
     } else if(26 <= age && age <= 35){
         return "Mid"
     } else if (36<= age && age<= 55) {
         return "Old"
     }
 } 
 
 const adicionarVotos = (propriedade1, propriedade2) => (acc,current) => ({
     ...acc,  
     [propriedade1]: acc[propriedade1] ++,
     [propriedade2]: current.voted == true ? acc[propriedade2] ++ : acc[propriedade2]
 })
 
 const votosYoung = adicionarVotos ("numYoungPeople","numYoungVotes")
 const votosOld = adicionarVotos ("numOldPeople", "numOldVotes")
 const votosMid = adicionarVotos ("numMidPeople","numMidVotes")
 
 const determinarVotos = eleitores.reduce((acc,current)=> {
     
     const faixaEtaria = determinarFaixaDeIdade(current.age)
     
     if(faixaEtaria.toUpperCase().includes("YOUNG")){
         votosYoung(acc, current)
     } else if(faixaEtaria.toUpperCase().includes("MID")){
         votosOld(acc, current)
     } else if(faixaEtaria.toUpperCase().includes("OLD")) {
         votosMid(acc, current)
     }
 
     return acc
 },
 {numYoungVotes: 0, numYoungPeople: 0, numMidVotes: 0, numMidPeople: 0, numOldVotes: 0, numOldPeople: 0})
 
 console.log(determinarVotos)