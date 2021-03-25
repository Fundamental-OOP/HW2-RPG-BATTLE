# HW2-RPG-GAME

## Glossary

1. **RPG**: The role-play turn-based battle game we are going to develop.
2. **Unit**: A unit has HP (Health Point), MP (Magic Point) and STR (Strength), and a set of skills.
3. **Troop**: A set of units who are teamed up under a battle.
4. **Battle**: The place where two troops are fighting against each other.
5. **Skill**: A special action that can cause damage or some effects to units.
6. **Opponent**: An unit who is not in your troop and fights against you.
7. **Ally**: An unit who is in your troop.
8. **Damaging actions**: The actions that can cause damage on units.

## Skills

- **Waterball**: (Damaging | MP: 50)
    - Attack one opponent with 120 damage.
- **Fireball**: (Damaging | MP: 50)
    - Attack all opponents with 50 damage.
- **SelfHealing**: (MP: 50)
    - Heal myself to restore 150 HP.
- **Petrochemical**: (MP: 100)
    - Turn one opponent into _Petrochemical_ state in 3 rounds (include the current round). The units in petrochemical
      state can only skip and make no actions in their turns.
- **Poison**: (MP: 80)
    - Turn the opponents into _Poisoned_ state in 3 rounds (include the current round). A unit in the poison state will
      lose 30 HP on every turn.
- **Summon**: (MP: 150)
    - Summon a Slime (HP: 100, MP: 0, STR: 50. No skills but can perform basic attack) in our troop. The slime's turn is
      skipped in the round it's summoned.
- **SelfExplosion**: (Damaging | MP: 200)
    - Commit suicide (turn Hp to 0) and cause 150 damage to all the units under the battle.
- **Cheerup**: (MP: 100)
    - All the allies in the own troop are turned into _Cheerup_ state in 3 rounds (include the current round). A unit in
      the cheerup state will have an extra 20 damage on every _damaging-action_ performed.
- **MagicShield**: (MP: 100)
    - Turn yourself into _MagicShieldedState_ in 3 rounds (include the current round). A unit in the magic-shielded
      state will gain MP from every damage he takes. (For example, if you are damaged 20 hp your mp is increased by 20.)
- **OnePunch**: (MP: 180)
    - Give one opponent a One-Punch. The damage is determined randomly. You don't need to implement this skill yourself.
      Integrate the provided `OnePunch` class to perform this skill.

## Input Format

```yml
#START-MY-TROOP
<My Troop>
  #END-MY-TROOP
  #START-ANOTHER-TROOP
<Opponent's Troop>
  #END-ANOTHER-TROOP
<a sequence of Hero's actions>
```

```
<My Troop> = <Opponent's Troop> = 
<Unit>
<Unit>
<Unit> 
...
```

`<Unit> = <Unit's Name> <HP> <MP> <Strength> < Skill> < Skill> < Skill> ...`
where both `<HP>`, `<MP>` and `<Strength>` are zeros or positive integers.

## Output Format



## Sample Input

```yml
#START-MY-TROOP
Hero 500 500 30 Waterball Fireball SelfHealing
#END-MY-TROOP
#START-OPPONENT-TROOP
Slime1 100 0 50
Slime2 120 0 50
Slime3 130 0 50
#END-OPPONENT-TROOP
#START-BATTLE
0
1
2
1
1
3
1
0
1
0
```

## Sample Output

```
*Hero's turn (Hp: 500, MP: 500, Str: 30, State: Normal).
Select an action: (0) BasicAttack (1) Waterball (2) Fireball (3) SelfHealing
Select 1 target: (0) #Slime1 (1) #Slime2 (2) #Slime3
*Hero attacks #Slime2.
*Hero causes 30 damage to #Slime2.
#Slime2 loses 30 HP.
#Slime1's turn (Hp: 100, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime1 attacks *Hero.
#Slime1 causes 50 damage to *Hero.
*Hero loses 50 HP.
#Slime2's turn (Hp: 90, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime2 attacks *Hero.
#Slime2 causes 50 damage to *Hero.
*Hero loses 50 HP.
#Slime3's turn (Hp: 130, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime3 attacks *Hero.
#Slime3 causes 50 damage to *Hero.
*Hero loses 50 HP.
*Hero's turn (Hp: 350, MP: 500, Str: 30, State: Normal).
Select an action: (0) BasicAttack (1) Waterball (2) Fireball (3) SelfHealing
*Hero uses Fireball on #Slime1, #Slime2, #Slime3
*Hero causes 50 damage to #Slime1.
#Slime1 loses 50 HP.
*Hero causes 50 damage to #Slime2.
#Slime2 loses 50 HP.
*Hero causes 50 damage to #Slime3.
#Slime3 loses 50 HP.
#Slime1's turn (Hp: 50, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime1 attacks *Hero.
#Slime1 causes 50 damage to *Hero.
*Hero loses 50 HP.
#Slime2's turn (Hp: 40, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime2 attacks *Hero.
#Slime2 causes 50 damage to *Hero.
*Hero loses 50 HP.
#Slime3's turn (Hp: 80, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime3 attacks *Hero.
#Slime3 causes 50 damage to *Hero.
*Hero loses 50 HP.
*Hero's turn (Hp: 200, MP: 450, Str: 30, State: Normal).
Select an action: (0) BasicAttack (1) Waterball (2) Fireball (3) SelfHealing
Select 1 target: (0) #Slime1 (1) #Slime2 (2) #Slime3
*Hero uses Waterball on #Slime2
*Hero causes 120 damage to #Slime2.
#Slime2 loses 120 HP.
#Slime2 dies.
#Slime1's turn (Hp: 50, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime1 attacks *Hero.
#Slime1 causes 50 damage to *Hero.
*Hero loses 50 HP.
#Slime3's turn (Hp: 80, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime3 attacks *Hero.
#Slime3 causes 50 damage to *Hero.
*Hero loses 50 HP.
*Hero's turn (Hp: 100, MP: 400, Str: 30, State: Normal).
Select an action: (0) BasicAttack (1) Waterball (2) Fireball (3) SelfHealing
*Hero uses SelfHealing
[SelfHealing] *Hero restores 150 hp.
#Slime1's turn (Hp: 50, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime1 attacks *Hero.
#Slime1 causes 50 damage to *Hero.
*Hero loses 50 HP.
#Slime3's turn (Hp: 80, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime3 attacks *Hero.
#Slime3 causes 50 damage to *Hero.
*Hero loses 50 HP.
*Hero's turn (Hp: 150, MP: 350, Str: 30, State: Normal).
Select an action: (0) BasicAttack (1) Waterball (2) Fireball (3) SelfHealing
Select 1 target: (0) #Slime1 (1) #Slime3
*Hero uses Waterball on #Slime1
*Hero causes 120 damage to #Slime1.
#Slime1 loses 120 HP.
#Slime1 dies.
#Slime3's turn (Hp: 80, MP: 0, Str: 50, State: Normal).
Select an action: (0) BasicAttack
#Slime3 attacks *Hero.
#Slime3 causes 50 damage to *Hero.
*Hero loses 50 HP.
*Hero's turn (Hp: 100, MP: 300, Str: 30, State: Normal).
Select an action: (0) BasicAttack (1) Waterball (2) Fireball (3) SelfHealing
Select 1 target: (0) #Slime3
*Hero uses Waterball on #Slime3
*Hero causes 120 damage to #Slime3.
#Slime3 loses 120 HP.
#Slime3 dies.
You win.
```