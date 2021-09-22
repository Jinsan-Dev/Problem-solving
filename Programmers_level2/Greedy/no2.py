# 문제: 각 자리가 0~9로 이루어진 문자열 S에 대해, 왼쪽부터 오른쪽으로 숫자 하나씩 확인하며 숫자 사이에 'x' 혹은 '+'를 이용해 결과적으로 제일 큰 수를 만들어 출력하라
#     단, 모든 연산은 항상 왼쪽에서부터 순차적으로 이루어진다.

# 내 답안
def answer(S):
  answer = ''
  s = list(map(int, S)
  for num in s:
    if num == 0 or num == 1:
      answer+=num
    else:
      answer*=num
  return answer
