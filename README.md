# 본 Repository는 파이썬(Python3)을 이용한 코딩 테스트(Problem-solving)를 대비하기 위해 만들어졌습니다.

## List (리스트)

list[n:m] --> list의 n번째 원소부터, m-1번째 원소까지를 의미
list[-n] --> list의 뒤에서부터 n번째 원소를 의미

##### n x m 크기의 배열을 한줄에 선언하는 법

    array = [[0]*m for _ in range(n)]       # 이때, 반복을 수행하되 반복을 위한 변수의 값을 무시하고자할 때 언더바(_) 사용
    
##### 리스트 관련 메소드

    array.sort()
    array.sort(reverse=True)                # 내림차순
    array.reverse()                         # 리스트 순서 반대로
    array.insert(idx, value)
    array.count(value)                      # 리스트 내 값의 개수를 반환
    array.remove(idx)
    
###### 리스트에 존재하는 특정 원소를 모두 제거할 때

    remove_set = {3,5}
    removed_arr = [i for i in array if i not in remove_set]
    
