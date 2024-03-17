package gitbal.backend.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/schoolRank")
@Tag(name = "학교 랭킹 API(미구현)", description = "학교 랭킹페이지를 위한 api입니다.")
public class SchoolRankController {

    @GetMapping("/mySchool")
    @Operation(summary = "내 학교 정보", description = "내 학교 정보 탭 관련 api 요청입니다.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "내 학교 정보 요청을 성공했습니다."),
        @ApiResponse(responseCode = "5xx", description = "내 학교 정보 요청을 실패했습니다.")
    })
    public void mySchoolInfo(){ // TODO : 로그인한 유저로 봐야함.

    }


    @GetMapping("/firstSchool")
    @Operation(summary = "1등 학교 정보", description = "1등 학교 정보 탭 관련 api 요청입니다.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "1등 학교 정보 요청을 성공했습니다."),
        @ApiResponse(responseCode = "5xx", description = "1등 학교 정보 요청을 실패했습니다.")
    })
    public void firstRankSchoolInfo(){

    }

    @GetMapping("/schoolList")
    @Operation(summary = "학교 리스트", description = "학교 리스트 탭 관련 api 요청입니다.")
    @ApiResponses(value = {
        @ApiResponse(responseCode = "200", description = "학교 리스트 요청을 성공했습니다."),
        @ApiResponse(responseCode = "5xx", description = "학교 리스트 요청을 실패했습니다.")
    })
    public void schoolList(){

    }

}