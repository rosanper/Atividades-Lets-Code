let relogio;
let competidor;
let tempoTotal = 0;
let centSeg = 0
let seg = 0
let min = 0


// Pegar Competidor  
function pegarinput(){
    const formulario = document.querySelector("form")
    const input = document.querySelector("input")
    competidor = input.value
    
    if(competidor){
        formulario.reset()
        return competidor 
    } else{
        return alert("Escreva o nome do competidor")
    }
   
}

function mostrarCompetidor(){
    let competidorAtual = document.querySelector("h2")
    competidorAtual.innerText = `${competidor}:`
}

// Cronometro

let minutos = document.querySelector("#minutos")
let segundos = document.querySelector("#segundos")
let centesimoDeSegundos = document.querySelector("#centesimoDeSegundos")
    
function iniciarCronometro(){
    relogio = setInterval(()=>{
        tempoCorrida();
    },10)
}  

function tempoCorrida(){

    tempoTotal++
    centSeg++

    if(centSeg>=100){
        centSeg = 0
        seg++
    }

    if(seg>=10){
        seg = 0
        min++
    }
    
    mostrarNumeros()
}

function mostrarNumeros(){
    minutos.innerText = tempoMostrador(min)
    segundos.innerText = tempoMostrador(seg)
    centesimoDeSegundos.innerText = tempoMostrador(centSeg)
}

function tempoMostrador(value){
    return value > 10 ? value : `0${value}`
} 
 
function pararCronometro(){
    clearInterval(relogio)
}

function limparMostrador(){
    tempoTotal = 0;
    centSeg = 0
    seg = 0
    min = 0
    mostrarNumeros() 
}

// Adicionar no Storage
   
let session = sessionStorage.length === 0 ? localStorage.length + 1: localStorage.length  // => O session foi criado na intenção de que para cada nova sessão fosse adicionado um novo valor no Local Storage
let campeao;
let tempoCampeao;

function addSessionStorage(){
    sessionStorage.setItem(competidor, tempoTotal)
}

function addLocalStorage(name,time){
    let chave = `Vencedor Round ${session}`
    let valor = {
        jogador:name,
        tempo: time,
        unidadeDeTempo: "Centesimo de segundos"
    }
    localStorage.setItem(chave,JSON.stringify(valor))  
}

function maisRapido(){
    if(!campeao){
        campeao = competidor
        tempoCampeao = tempoTotal
    }
    let competidorComparador
    let tempoComparador
    for(let i=0; i<sessionStorage.length;i++){
        competidorComparador = sessionStorage.key(i)
        tempoComparador = +sessionStorage.getItem(competidorComparador)
        if(tempoComparador<tempoCampeao){
            campeao = competidorComparador
            tempoCampeao = tempoComparador
        }
    }
}

// Botões


let botaoStart = document.getElementById("start")
let botaoStop = document.getElementById("stop")


function start(){
    limparMostrador()
    let jogador = pegarinput()
    if(jogador){
        iniciarCronometro()
        mostrarCompetidor()

    
        botaoStart.disabled = true
        botaoStop.disabled = false
    }    

}

function stop(){
    
    pararCronometro()
    addSessionStorage()
    maisRapido()
    addLocalStorage(campeao,tempoCampeao)

    botaoStart.disabled = false
    botaoStop.disabled = true
}