  
let relogio;
let tempo;
let competidor;
        
function pegarinput(){
    const formulario = document.querySelector("form")
    const input = document.querySelector("input")
    competidor = input.value
    
    if(competidor){
        // console.log(competidor)
        formulario.reset()
        return competidor 
    } else{
        return alert("Escreva o nome do competidor")
    }
   
}
        
    
function iniciarCronometro(){
    tempo = 0;
    relogio = setInterval(()=>{
        tempo++
        // console.log(tempo)
    },100)
}
        
function tempoCorrida(time){
    let decSeg = time % 10
    let seg = Math.floor(time / 10)
    let min = 0 

    if(seg>60){
        min = Math.floor(seg / 60)
        seg = seg % 60
    }

    // console.log(decSeg)
    // console.log(seg)
    // console.log(min)

    return {
        minutos: min, 
        segundos: seg, 
        decimosDeSegundo: decSeg
    }    
}

function zerarCronometro(){
    clearInterval(relogio)
    // console.log(tempo)
}



let mostrador = document.querySelector(".mostrador")

function mostraTempo(object){
    for(let value in object){
        let t = document.createElement("p")
        mostrador.appendChild(t)
        t.innerText = ` ${object[value]} : ${value} `
    }
}

function mostrarCompetidor(){
    let competidorAtual = document.createElement("p")
    mostrador.appendChild(competidorAtual)
    competidorAtual.innerText = `${competidor}:`
}

function limparMostrador(){
    let tempoMostrado = document.querySelectorAll(".mostrador p")
    console.log(tempoMostrado)
    for(let ind of tempoMostrado){
        ind.remove()
    }

}

function addSessionStorage(){
    sessionStorage.setItem(competidor, tempo)
}

function addLocalStorage(valor){
    localStorage.setItem("Vencedor Round 1", valor)
}

function maisrapido(){
    let campeao = sessionStorage.key(0)
    let tempoCampeao = sessionStorage.getItem(campeao)
    for(let i = 0; i < sessionStorage.length ; i++){
        let adversario = sessionStorage.key(i)
        let tempoAdversario = sessionStorage.getItem(adversario)
        if(tempoCampeao > tempoAdversario){
            campeao = adversario
            tempoCampeao = tempoAdversario
        }
    }
    return campeao
}

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
    
    zerarCronometro()
    let tela = tempoCorrida(tempo)
    mostraTempo(tela)
    addSessionStorage()
    let vencedor = maisrapido()
    // console.log(vencedor)
    addLocalStorage(vencedor)

    botaoStart.disabled = false
    botaoStop.disabled = true
}


        

