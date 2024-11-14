def solution(bandage, health, attacks):
    answer = 0
    last = attacks[-1]
    cnt = 0
    max_heal = health
    for i in range(last[0]+1):
        flag = True
        for j in range(len(attacks)):
            if i == attacks[j][0]:
                dmg = attacks[j]
                health -= dmg[1]
                cnt = 0
                if health < 1:
                    return -1

                flag = False
                break
        if flag:
            cnt +=1
            if cnt ==bandage[0]:
                health +=bandage[2]+bandage[1]
                cnt = 0
                if health >= max_heal:
                    health = max_heal
                    continue
                else:
                    continue
            health += bandage[1]
            if health >= max_heal:
                health = max_heal

    if health >= 1:
        return health
    else:
        return -1
