<%  //asp

    str = Request("str")
    //요청한 값을 str에 저장.
    If not str = "" Then
    //무언가 입력되었다면, 
        result = Replace(str,"a","aad")
        //str의 a를 aad로 바꿔서 result에 저장
        result = Replace(result,"i","in")
        //result의 i를 in으로 바꿈
        result1 = Mid(result,2,2)
        //result의 2번째 글자 기준 2글자를 자름. (2,3)
        result2 = Mid(result,4,6)
        //result의 4번째 글자부터 6글자 자름. (4,5,6,7,8,9)
        result = result1 & result2
        //합침
        Response.write result
        //결과 출력
        If result = "admin" Then
        //result가 admin이 되려면!?!
            pw = "????????"
            /* a>aad, i>in, (2,3)+(4,5,6,7,8,9)가 결국 admin이 되려면
            (2,3)은 (a,d), (4,5,6)은 min이 되어야 함.
            고로 ami.*/
        End if
    End if
%>