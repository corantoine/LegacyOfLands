 ```mermaid
---
title : Legacy Of Lands
---
sequenceDiagram
    participant ressources
    actor Villageois
Villageois ->> ressources : part récolter des ressources
destroy ressources
Villageois ->> ressources : ressources pillées

box grey Village
participant Village
participant maison
participant Mur de défense
participant Villageois
end

Villageois ->> Village : ramène les ressources
Villageois ->> Mur de défense: construction du mur terminée grâce aux ressources 
Villageois ->> maison : part se reposer
destroy Villageois
Villageois ->> maison : Villageois se repose
actor Soldats ennemis
Soldats ennemis ->> Village : attaquent
    destroy Mur de défense
    Soldats ennemis ->> Mur de défense : détruisent 
Soldats ennemis ->> Village : pas d'autres dégâts
```

Un villageois part récolter des ressources. 
Il ramène ces ressources au village, ce qui permet de terminer la construction d'un nouveau mur de défense. 
Ensuite, le villageois va se reposer dans sa maison. 
Pendant la nuit, un groupe de soldats ennemis attaque le village. 
Par chance, ils ne parviennent à détruire que le nouveau mur de défense.
