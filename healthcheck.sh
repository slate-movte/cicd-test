for cnt in 1 2 3 4 5 6 7 8 9 10
do
    echo "서버 응답 확인중 .. (${cnt}/10)"
    UP=$(curl -s http://localhost:8080/api/health | grep 'ok')
    echo $UP
    if [ -z "${UP}" ]; then
        sleep 2
        continue
    else
        break
    fi
done

echo "count : $cnt"
if [ $cnt -eq 10 ]
then
    echo "서버가 정상적으로 구동되지 않았습니다"
    exit 1
fi
