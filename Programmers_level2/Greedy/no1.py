# 문제: 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다. 단, 두번째 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다.
# 1. N에서 1을 뺀다.
# 2. N을 K로 나눈다.
# 예시: N=17, K=4 일 때, 1번 과정 수행하면 N=16. 2번 과정 2번 수행 시 N=1
# 수행과정의 최소 횟수를 구하는 프로그램을 작성하라

# 내 답안
def answer(N, K):
  answer = 0
  while(N != 1):
    if N%K == 0:
      N = N/K
    else:
      N-=1
    answer+=1
  return answer


# 모범 답안
def answer(N, K):
  answer = 0
  while True:
    target = (N // K) * K   # N이 K로 나누어떨어질 때까지 빼기
    answer += (n - target)
    n = target
    
    if N < K:               # N이 K로 나누어지지 않을 때
      break
    
    answer+=1               # 1번 과정 한번 추가
    N //= K
    
  answer+=(n-1)             # 마지막으로 남은 수에 대해 1씩 빼기 (K보다 작은 수에서 1씩 빼기)
  print(answer)
