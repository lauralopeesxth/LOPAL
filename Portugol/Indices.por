programa {
  funcao inicio() {
    inteiro n[8],i,numero,maior=0

    para(i = 0; i < 8; i++){
    escreva("qual o valor do indice: ",i, "?\n")
    leia(n[i])
  }
    para(i = 0;i < 8;i++){
      se(n[i]>maior){
        maior = n[i]
}
     escreva("o maior valor:",maior)
    }
  }
}