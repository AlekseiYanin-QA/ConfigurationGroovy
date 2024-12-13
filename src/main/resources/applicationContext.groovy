package org.example.demo

beans {
    // Определение бина ServiceB
    serviceB(ServiceB) {
        // Здесь можно настроить свойства или зависимости
    }

    // Определение бина RequestIdGenerator
    requestIdGenerator(RequestIdGenerator) {
        // Настройка, если необходимо
    }

    // Определение бина ServiceC, который зависит от ServiceB
    serviceC(ServiceC) {
        someDependency(ref('serviceB')) // ServiceC зависит от ServiceB
    }
}
