// Modulo calculadora

function Somar(array){
    return array.reduce((acc,current)=>acc+current,0);
}

function Subtrair(array){
    return array.reduce((acc,current)=>acc-current);
}

function Multiplicar(array){
    return array.reduce((acc,current)=>acc*current);
}

function Dividir(array){
    return parseFloat(array.reduce((acc,current)=>acc/current).toFixed(3));
}

let moduloCalculadora = (() => {

    let _numerosParaOperar = []
    let _operadorParaCalculo = []

    let entradasSalvas = {}

    const _entradaNumero = num => {
        return _numerosParaOperar = [..._numerosParaOperar, num] 
    }

    const operadoresPossiveis = {
        "Somar": Somar,
        "Subtrair": Subtrair,
        "Multiplicar": Multiplicar,
        "Dividir": Dividir
    }

    const _entradaOperador = operador => {
        if (_operadorParaCalculo.length !== 0){
            return "Você já adicionou o operador, agora digite o número a ser operado"
        }
        if(operadoresPossiveis[operador]){
            return _operadorParaCalculo = [..._operadorParaCalculo, operador];
        }
        return 'Você deve digitar um operador: "+" , "-", "*", "/" '
    }

    const enter = dado => {
        if(typeof dado === "number"){
            return _entradaNumero(dado)
        }
        if( typeof dado === "string"){
            return _entradaOperador(dado)
        }
        return "Entre com um numero ou um operador"
        
    }

    const _zerarArray = array => {
        while(array.length!==0){
            array.pop();
        }
    }

    const equals = () => {
        const [op] = _operadorParaCalculo

        const resultado = operadoresPossiveis[op](_numerosParaOperar)

        let chave = `${op}: ${_numerosParaOperar}`

        entradasSalvas = {...entradasSalvas, [chave]: `Resultado: ${resultado}`}
        _zerarArray(_numerosParaOperar)
        _zerarArray(_operadorParaCalculo)

        return resultado
    }

    const reset = () => {
        entradasSalvas = {}
        return entradasSalvas
    }

    const list = () => {
        return entradasSalvas
    }

    return {
        enter,
        equals,
        list,
        reset
    }

})()


// DOM Calculadora

const formulario = document.querySelector('.number')
const enter = document.getElementById('enter')
const numero = document.querySelector('input[type="number"]')
const numerosOperar = document.querySelector('.screen span')

numero.focus()

const zerarVisor = () => numerosOperar.innerText = ``


enter.onclick = function(){
    if(numero.value){
        moduloCalculadora.enter(+numero.value)
        numerosOperar.innerText += ` ${numero.value}  `
        formulario.reset()  
    } 

    numero.focus()
}


const equals = document.getElementById('equals')
const result = document.querySelector('.result span')
const save = document.querySelector('.save div')
let tabela;

const mostrarResultado = () => {
    let resultado = moduloCalculadora.equals()
    result.innerText = resultado
}

equals.onclick = function() {
    const operadorSelecionado = document.querySelector('input[type="radio"]:checked')
    moduloCalculadora.enter(operadorSelecionado.value)
    
    mostrarResultado()
    zerarVisor()
    numero.focus()

    // console.log(moduloCalculadora.list())
    

}

const mostrarHistorico = () =>{
    
    if(tabela){
        tabela.remove()
    }

    let operacoes = moduloCalculadora.list()
    tabela = document.createElement("table")
    save.appendChild(tabela)
        for(let value in operacoes){
            let linha = document.createElement("tr")
            tabela.appendChild(linha)
            let celulaOperacao = document.createElement("td")
            celulaOperacao.innerText = value
            let celulaDivisao = document.createElement("td")
            celulaDivisao.innerText = ` => `
            let celulaValor = document.createElement("td")
            celulaValor.innerText = operacoes[value]
            linha.appendChild(celulaOperacao) 
            linha.appendChild(celulaDivisao) 
            linha.appendChild(celulaValor) 
        } 
}

const apagarHistorico = () =>{
    moduloCalculadora.reset()
    tabela.remove()
}
   


