# 파이썬(Python3)을 이용한 코딩 테스트를 대비


## 입력 및 출력

##### map() -> 리스트의 모든 원소에 각각 특정한 함수를 적용할 때 사용

    # 공백을 기준으로 구분된 데이터를 입력받을 때
    list(map(int, input().split()))         # input() 메소드로 한 줄의 문자열을 받고, split()으로 공백제거 후, 구분된 원소에 int 함수 적용
    a, b, c = map(int,input().split())      # 여러개의 원소를 한번에 할당할 수 있음
    
    # input 보다 빠른 메소드
    import sys
    data = sys.stdin.readline().rstrip()    # rstrip() -> 엔터 문자를 없앰
    
##### print(f'{}')

    result = 7
    print(f'정답은 {result}입니다')            # 형변환할 필요가 없음

##### 함수는 여러개의 값을 리턴 가능함

    def returnFive():
    ...
    return a, b, c, d


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
    

## 튜플 (Tuple)

한번 선언된 겂은 변경할 수 없으며, 리스트에 비해 공간 효율적   

서로 다른 성질의 데이터를 묶어서 관리할 때 사용 (e,g. 최단 경로 알고리즘에서 (비용,노드번호)로 자주 사용)   
데이터 나열을 해싱의 키 값으로 사용할 때

## 딕셔너리 (Dict)

(key, value) 쌍을 데이터로 가짐    
해시 테이블을 이용하기 때문에, 데이터에 대한 조회 및 수정이 O(1) 시간에 이루어짐    

    data = dict()
    data['key'] = 'value'
    keyList = data.keys()                   # key 값들만 뽑아서 리스트 반환
    valueList = data.values()               # value 값들만 뽑아서 리스트로 반환
    

## 집합 (Set)

중복을 허용하지 않으며, 순서는 상관없음

    data = set([1,2,3,3,4,4,5,5,5,5,5,5])   # data -> {1,2,3,4,5}
    
###### 집합 관련 메소드 (a,b 가 집합일 때)

    a|b                                     # 합집합 (or)
    a&b                                     # 교집합 (and)
    a-b                                     # 차집합
    a.add(8)                                # 집합에 원소 1개 추가
    a.update([9,10])                        # 원소 n개 추가
    a.remove(8)                             # 원소 제거


## 람다 표현식 (lambda)

간단한 연산을 함수를 만들지 않고서도 가능하도록 함

    print((lambda a, b: a+b)(3, 7))         # (lambda 필요한 파라미터: 연산)(실제 파라미터)
    
    arr = [('val1', 40), ('val2', 60), ('val3', 80)]
    print(sorted(arr, key=lambda x: x[1]))  # x[1]을 기준으로 소팅
    
